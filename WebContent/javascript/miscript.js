/**
 * 
 */
$(document).ready(function(){
	
		$("form").hide();
		
		 
		$('#tarjeta').on('click',function(){
			  $('.tarjeta').toggle('slow');
		});
			
		
		$('#efectivo').on('click',function(){
		      $('.efectivo').toggle('slow');
		});
		
		$('#gasoleo').on('click',function(){
			  $('.gasoleo').toggle('slow');
		});
			
		
		$('#gasolina').on('click',function(){
		      $('.gasolina').toggle('slow');
		});
		
	
		
		
	});