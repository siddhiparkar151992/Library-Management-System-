function setSelectedOption(x){
	var selectedMenu=x.innerHTML;
	var index=x.value;
	document.getElementById("searchOption").value=index;

}


function showButtonName(x) {

	var table = x.parentNode.parentNode.parentNode;
	cells = table.getElementsByTagName('td');
	var textId = "hiddenText" + table.rowIndex;
	document.getElementById(textId).value = cells[0].innerText;
	
		document.forms["reserveButtons"].action="request?userid="+cells[1].innerText;
	document.forms["reserveButtons"].submit();

}
