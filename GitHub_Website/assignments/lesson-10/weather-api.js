let weatherRequest = new XMLHttpRequest();
let apiURLstring = 'https://api.openweathermap.org/data/2.5/weather?id=5604473&units=imperial&APPID=f2a8b31a46112db97d88158399fd671c';
weatherRequest.open('GET', apiURLstring, true);
weatherRequest.send();

weatherRequest.onload = function () {
	let weatherData = JSON.parse(weatherRequest.responseText);
	console.log(weatherData);
}
