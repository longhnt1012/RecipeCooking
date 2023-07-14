$(document).ready(function() {
	var max_fields      = 12; //maximum input boxes allowed
	var wrapper   		= $(".input_fields_wrap"); //Fields wrapper
	var add_button      = $(".add_field_button"); //Add button ID
	
	var x = 1; //initlal text box count
	$(add_button).click(function(e){ //on add input button click
		e.preventDefault();
		if(x <= max_fields){ //max input box allowed
			x++; //text box increment
			$(wrapper).append('<div class="row" style="margin-top: 20px; margin-bottom: 20px"><div class="col-5" style="margin-left: -10px"><input class="form-control" type="text" name="ingredientName" placeholder="Typing Ingredients" style="margin-left: 10px; margin-right: 10px" ></div><div class="col-2"> <input class="form-control" type="number" name="quantity" step="0.1" min="1" placeholder="Amount" style="margin-left: 10px" ></div><div class="col-2" style="display: inline-table,margin-top: 2px"><input class="form-control" type="text" name="unit" placeholder="Unit" style="margin-left: 10px" ></div><a href="#" class="remove_field" style="margin:auto; display: table;">Remove</a></div>'); //add input box
		}
	});
	
	$(wrapper).on("click",".remove_field", function(e){ //user click on remove text
		e.preventDefault(); $(this).parent('div').remove(); x--;
	})
});

