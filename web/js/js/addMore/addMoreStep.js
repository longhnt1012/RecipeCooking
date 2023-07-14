$(document).ready(function() {
	var max_fields      = 12; //maximum input boxes allowed
	var wrapper   		= $(".input_fields_wrap_Step"); //Fields wrapper
	var add_button      = $(".add_field_button_Step"); //Add button ID
	
	var x = 1; //initlal text box count
	$(add_button).click(function(e){ //on add input button click
		e.preventDefault();
		if(x <= max_fields){ //max input box allowed
			x++; //text box increment
			$(wrapper).append('<div class="row" style="margin-top: 20px; margin-bottom: 20px" ><div class="col-3" style="margin-left: 0px"><input class="form-control" type="number" min="1" name="stepNumber" placeholder="step ..."/></div><div class="col-7"><input class="form-control" type="text" name="instructions" placeholder="Instructions...."/></div><a href="#" class="remove_field" style="margin:auto; display: table;">Remove</a></div>'); //add input box
		}
	});
	
	$(wrapper).on("click",".remove_field", function(e){ //user click on remove text
		e.preventDefault(); $(this).parent('div').remove(); x--;
	})
});