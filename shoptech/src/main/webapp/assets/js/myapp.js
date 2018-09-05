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

	default:
		$('#home').addClass('active');
		break;
	}
});