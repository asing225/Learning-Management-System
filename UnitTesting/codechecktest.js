module.exports = function(code){
	clearConsole();
	var array = x.replace("window.alert(","").replace(");","").replace(/\s+/g, '');
	array = array.split('+').join(',').split('-').join(',').split('(').join(',').split(')').join(',').split(';').join(',').split(',');
	for(var c=0; c<array.length; c++){
			if(array[c] == 0 & array[c] != '')
				return -1;
			if(lessThanZero(array[c]) == 0)
				return 0;
	}
	return 1;
}
