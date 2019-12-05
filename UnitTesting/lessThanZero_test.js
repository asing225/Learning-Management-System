module.exports = function(eq){
	if(eq[(eq.length)-1] == '-')
		eq = eq.substring(0,(eq.length-1));
	if (eq[0] == '-')
		eq = eq.substring(1,(eq.length-1));
	if (eval(eq) < 0)
		return 0;
	else
		return 1;
}
