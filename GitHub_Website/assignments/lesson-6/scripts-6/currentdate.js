var year = new Date().getFullYear;

var date = '&copy; Weather Site Project ${year}. All Rights Reserved.';

document.getElementsByTagName('footer')[0].innerHTML = year;