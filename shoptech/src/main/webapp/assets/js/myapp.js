$(function () {
	switch (menu) {
	case 'A propos' :
		$('#about').addClass('active');
		break;
	case 'Liste des produits' :
		$('#listsProduits').addClass('active');
		break;
	case 'Contactez nous' :
		$('#contact').addClass('active');
		break;		
	case 'Tous les produits' :
		$('#listsProduits').addClass('active');
		break;
		
	case 'Home' :
		$('#home').addClass('active');
		break;
	default:
		$('#listsProduits').addClass('active');
		$('#a_'+menu).addClass('active');
	
		break;
	}
});