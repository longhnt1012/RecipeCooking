<<<<<<< HEAD
                                var max_fields = 7; // Số lượng tối đa các ô input
                                var inputContainer = document.querySelector("#inputIngredient"); // Các ô input sẽ được đặt vào wrapper này
                                var x = 2; // Biến đếm số lượng ô input hiện tại
                                function addMoreIngredients() {
                                    var newInput = document.createElement("div");
                                    newInput.className = 'row';
                                    newInput.style = 'margin-top: 20px; margin-bottom: 20px; margin-left: 3px';
                                    newInput.innerHTML =
                                            '<div class="col-7" style="margin-left: -25px">' +
                                            '<select class="form-control" name="ingredientName"> <c:forEach var="item" items="${LIST_NUTRITIONAL}"> <option value="${item.name}">${item.name}</option> </c:forEach> </select>' +
                                            '</div>' +
                                            '<div class="col-2">' +
                                            '<input class="form-control" type="number" step="0.1" name="quantity" min="1" placeholder="Amount" style="margin-left: 10px">' +
                                            '</div>' +
                                            '<div class="col-2" style="display: inline-table,margin-top: 2px">' +
                                            '<select class="form-control" name="unit"> <option value="Gram">Gram (g)</option> <option value="Kilogram">Kilogram (kg)</option> <option value="Pound">Pound (lb)</option> <option value="Milliliter">Milliliter (ml)</option> <option value="Liter">Liter </option> <option value="Cup">Cup </option> <option value="Teaspoons">Teaspoons (tsp)</option> <option value="Tablespoons">Tablespoons (tbsp)</option> <option value="Part">Part</option></select>' +
                                            '</div>' +
                                            '<button type="button" onclick="removeIngredient(this)" style="margin:auto; display: table;">Remove</button>';
                                    if (x <= max_fields) { // Kiểm tra số lượng ô input đã đạt tối đa chưa
                                        // Thêm ô input mới
                                        inputContainer.appendChild(newInput);
                                        x++;
                                        console.log(x);
                                    } else {
                                        alert('Can not create more');
                                    }
                                }

                                function removeIngredient(element) {
                                    var inputContainer = document.querySelector("#inputIngredient");
                                    inputContainer.removeChild(element.parentNode);
                                    x--;
                                }
=======
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

>>>>>>> fce2930ab019cfbb58ddaef83a7a648df06e8d71
