//https://wwww.learnwebcode.github.io/json-example/animals-1.json  this url is where we want to "get" the json data with ajax
var animalContainer = document.getElementById("animal-info");
var btn = document.getElementById("btn");

btn.addEventListener("click", function() {
	var ourRequest = new XMLHttpRequest();
	ourRequest.open('GET', 'https://github.com/GradyHodge/gradyhodge.github.io/blob/master/GitHub_Website/ajax-experiment/ajax-github-pull.json');
	ourRequest.onload = function() {
		var ourData = JSON.parse(ourRequest.responseText);
		renderHTML(ourData);
	};
	ourRequest.send();
});

function renderHTML(data) {
	var htmlString = "";

	for(i = 0; i < data.length; i++) {
		htmlString += "<p>" + data[i].name + " is a " + data[i].species + ".</p>";
	}

	animalContainer.insertAdjacentHTML('beforeend', htmlString);
}
