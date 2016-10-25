<html>
<head>
    <title>Hello world page</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript">


function makeTable(data){
	var col = [];
	for (var i = 0; i < data.length; i++) {
            for (var key in data[i]) {
                if (col.indexOf(key) === -1) {
                    col.push(key);
                }
            }
        }

        var table = document.createElement("table");
        table.style.border = "thick solid #0000FF";
        var tr = table.insertRow(-1);                   

        for (var i = 0; i < col.length; i++) {
            var th = document.createElement("th");      
            th.innerHTML = col[i];
            tr.appendChild(th);
        }

        // ADD JSON DATA TO THE TABLE AS ROWS.
        for (var i = 0; i < data.length; i++) {

            tr = table.insertRow(-1);

            for (var j = 0; j < col.length; j++) {
                var tabCell = tr.insertCell(-1);
                tabCell.innerHTML = data[i][col[j]];
            }
        }

        // FINALLY ADD THE NEWLY CREATED TABLE WITH JSON DATA TO A CONTAINER.
        var divContainer = document.getElementById("showData");
        divContainer.innerHTML = "";
        divContainer.appendChild(table);
}

function getCall(){
	    $.get("/naurooTest/phoneBook/", function(data, status){
            console.log("Data: " + data + "\nStatus: " + status);
            makeTable(data);
        
        });
	}

	function callSearch(){
		var value = document.getElementById('search').value;
		var searchtype = document.getElementById('searchtype').value;
		var url = '/naurooTest/phoneBook/search/'+searchtype+'/'+value;
	    $.get(url, function(data, status){
            console.log("Data: " + data + "\nStatus: " + status);
            makeTable(data);
        
        });
	}
	function callSave(){
		console.log("saving ???");
		var name = document.getElementById('name').value;
		var mobile = document.getElementById('mobile').value;
		var address = document.getElementById('address').value;
		var type = document.getElementById('type').value;
		
		var saveUrl='/naurooTest/phoneBook/add/'+name+'/'+mobile+'/'+type+'/'+address;
		$.get(saveUrl, function(data, status){
			console.log(data);
			location.reload();
		});
	}
</script>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<body onload="getCall()">
<div class="container">
  <h2>Sample Form</h2>
  <form id="formID">
    <div class="form-group">
      <label for="name">Name:</label>
      <input type="name" class="form-control" id="name" placeholder="Enter Name">
    </div>
   <div class="form-group">
      <label for="mobile">Mobile:</label>
      <input type="mobile" class="form-control" id="mobile" placeholder="Enter mobile">
    </div><div class="form-group">
      <label for="address">Adress:</label>
      <input type="address" class="form-control" id="address" placeholder="Enter address">
    <div class="form-group">
  <label for="type">Select Type:</label>
  <select class="form-control" id="type">
    <option>MOBILE</option>
    <option>PHONE</option>
    <option>HOME</option>
    <option>OTHER</option>
  </select>
</div>
    <button type="button" class="btn btn-default" onclick="javascript:callSave()">Submit</button>
  </form>

   </div><div class="form-group">
      <label for="search">search:</label>
      <input type="search" class="form-control" id="search" placeholder="Enter for search">
    <div class="form-group">
  <label for="searchtype">Select Search Type:</label>
  <select class="form-control" id="searchtype">
    <option>name</option>
    <option>mobile</option>
  </select>
  <button type="button" class="btn btn-default" onclick="javascript:callSearch()">Search</button>
</div>
<div id="showData" ></div>
</body>
</html>