package test.akhilesh.hackerearth.altimetric;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ShootOut {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		Point a, b, c, d;
		while (t > 0) {
			a = new Point(br.readLine().trim().split(" "));
			b = new Point(br.readLine().trim().split(" "));
			c = new Point(br.readLine().trim().split(" "));
			d = new Point(br.readLine().trim().split(" "));
			boolean status = properCrossingOfPoints(a, b, c, d);
			if (status)
				System.out.println("No");
			else
				System.out.println("Yes");
			t--;
		}
	}

	private static boolean properCrossingOfPoints(Point a, Point b, Point c, Point d) {
		if (linesIntersect(a.x, a.y, c.x, c.y, b.x, b.y, d.x, d.y)) {
			Point intersectPoint = getLineLineIntersection(a.x, a.y, c.x, c.y, b.x, b.y, d.x, d.y);
			if (intersectPoint == null || intersectPoint.equals(a) || intersectPoint.equals(b)
					|| intersectPoint.equals(c) || intersectPoint.equals(d)) {
				return false;
			} else {
				return true;
			}

		}
		return false;
	}

	public static boolean linesIntersect(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		if (x1 == x2 && y1 == y2 || x3 == x4 && y3 == y4) {
			return false;
		}
		int ax = x2 - x1;
		int ay = y2 - y1;
		int bx = x3 - x4;
		int by = y3 - y4;
		int cx = x1 - x3;
		int cy = y1 - y3;
		int alphaNumerator = by * cx - bx * cy;
		int commonDenominator = ay * bx - ax * by;
		if (commonDenominator > 0) {
			if (alphaNumerator < 0 || alphaNumerator > commonDenominator) {
				return false;
			}
		} else if (commonDenominator < 0) {
			if (alphaNumerator > 0 || alphaNumerator < commonDenominator) {
				return false;
			}
		}
		int betaNumerator = ax * cy - ay * cx;
		if (commonDenominator > 0) {
			if (betaNumerator < 0 || betaNumerator > commonDenominator) {
				return false;
			}
		} else if (commonDenominator < 0) {
			if (betaNumerator > 0 || betaNumerator < commonDenominator) {
				return false;
			}
		}
		if (commonDenominator == 0) {
			int y3LessY1 = y3 - y1;
			int collinearityTestForP3 = x1 * (y2 - y3) + x2 * (y3LessY1) + x3 * (y1 - y2);

			if (collinearityTestForP3 == 0) {

				if (x1 >= x3 && x1 <= x4 || x1 <= x3 && x1 >= x4 || x2 >= x3 && x2 <= x4 || x2 <= x3 && x2 >= x4
						|| x3 >= x1 && x3 <= x2 || x3 <= x1 && x3 >= x2) {
					if (y1 >= y3 && y1 <= y4 || y1 <= y3 && y1 >= y4 || y2 >= y3 && y2 <= y4 || y2 <= y3 && y2 >= y4
							|| y3 >= y1 && y3 <= y2 || y3 <= y1 && y3 >= y2) {
						return true;
					}
				}
			}
			return false;
		}
		return true;
	}

	public static Point getLineLineIntersection(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		int det1And2 = det(x1, y1, x2, y2);
		int det3And4 = det(x3, y3, x4, y4);
		int x1LessX2 = x1 - x2;
		int y1LessY2 = y1 - y2;
		int x3LessX4 = x3 - x4;
		int y3LessY4 = y3 - y4;
		int det1Less2And3Less4 = det(x1LessX2, y1LessY2, x3LessX4, y3LessY4);
		if (det1Less2And3Less4 == 0) {
			return null;
		}
		int x = (det(det1And2, x1LessX2, det3And4, x3LessX4) / det1Less2And3Less4);
		int y = (det(det1And2, y1LessY2, det3And4, y3LessY4) / det1Less2And3Less4);
		return new Point(x, y);
	}

	protected static int det(int a, int b, int c, int d) {
		return a * d - b * c;
	}

}

class Point {
	public Point(String[] split) {
		x = Integer.parseInt(split[0]);
		y = Integer.parseInt(split[1]);
	}

	public Point(int x2, int y2) {
		x = x2;
		y = y2;
	}

	int x;
	int y;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

}
