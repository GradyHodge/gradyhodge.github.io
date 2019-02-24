/*
Windchill | from my previous course CIT 160
*/
<script>
/* Input: User inputs temperature in Fahrenheit and wind speed in mile per hour
Processing: Run first function to get user input. Run second function to calculate wind chill.
Output: Display Wind Chill
*/
function doInputOutput(){
var tempF = parseFloat(document.getElementById('temperature').value);
var speed = parseFloat(document.getElementById('windSpeed').value);
var wind = windChill(tempF, speed);
var chill = Math.round(wind * 1)/1;
document.getElementById('chillDiv').innerHTML = chill;
}
function windChill(tempF, speed){
var f = 35.74 + (0.6215 * tempF) - (35.75 * Math.pow(speed, 0.16)) + (0.4275 * tempF) * Math.pow(speed, 0.16);
return f;
}
</script>
</head>

//place this part into the body of my html file
<body>
Input Temperature in Fahrenheit: <input type='text' id='temperature' size='5'><br>
Input Wind Speed in MPH: <input type='text' id='windSpeed' size='5'><br>
<button type='button' onclick='doInputOutput()'>Wind Chill</button>
<div id='chillDiv'></div>
</body>
</html>