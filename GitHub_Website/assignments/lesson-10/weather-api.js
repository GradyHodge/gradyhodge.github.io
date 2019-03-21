let weatherRequest = new XMLHttpRequest();
let apiURLstring = 'https://api.openweathermap.org/data/2.5/weather?id=5604473&units=imperial&APPID=f2a8b31a46112db97d88158399fd671c';
weatherRequest.open('GET', apiURLstring, true);
weatherRequest.send();

weatherRequest.onload = function () {
	let weatherData = JSON.parse(weatherRequest.responseText);
	console.log(weatherData);

	document.getElementById('cc-temp')	.innerHTML = weatherData.main.temp
	let icon = "http://openweathermap.org/img/w/" + weatherData.weather[0].icon +".png"
	let desc = weatherData.weather.description;

	document.getElementById('cc-img').setAttribute('src', icon)
	document.getElementById('cc-img').setAttribute('alt', desc)
}
 