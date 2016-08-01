var express = require('express');
var XLSX = require('xlsx');
var app = express();
var server = require('http').createServer(app);
var io = require('socket.io')(server);

app.get('/',function(req,res){
	res.sendFile(__dirname + '/index.html');
});

server.listen(8000,function(){
	console.log('Listening on port 8000!');
});

io.on('connection',function(client){
	console.log("client detected");
})


var getData = function(sheet_number)
{
	var wb = XLSX.readFile("example.xlsx");
	var mycontainer = {};
	for (x=1; x<6; x++){
        for (y=1; y<6; y++){
        xval = String(x)
        yval = String.fromCharCode('A'.charCodeAt(0)+y-1)
	try {
		mycontainer[yval+xval] = wb.Sheets[wb.SheetNames[0]][yval+xval]['v'];}
	catch (e) { mycontainer[yval+xval] = "NaN"; }
        }
        }
	return mycontainer;
}

setInterval( function(){ io.sockets.emit('update_cell',getData(0)); }, 1000);

