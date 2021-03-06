dojo._xdResourceLoaded({
depends: [["provide", "dojox.dtl.filter.integers"]],
defineResource: function(dojo){if(!dojo._hasResource["dojox.dtl.filter.integers"]){ //_hasResource checks added by build. Do not use _hasResource directly in your code.
dojo._hasResource["dojox.dtl.filter.integers"] = true;
dojo.provide("dojox.dtl.filter.integers");

dojo.mixin(dojox.dtl.filter.integers, {
	add: function(value, arg){
		value = parseInt(value);
		arg = parseInt(arg);
		return isNaN(arg) ? value : value + arg;
	},
	get_digit: function(value, arg){
		// summary:
		//		Given a whole number, returns the 1-based requested digit of it
		// desciprtion:
		//		1 is the right-most digit, 2 is the second-right-most digit, etc. Returns the
		//		original value for invalid input (if input or argument is not an integer,
		//		or if argument is less than 1). Otherwise, output is always an integer.
		value = parseInt(value);
		arg = parseInt(arg) - 1;
		if(arg >= 0){
			value += "";
			if(arg < value.length){
				value = parseInt(value.charAt(arg));
			}else{
				value = 0;
			}
		}
		return (isNaN(value) ? 0 : value);
	}
});

}

}});