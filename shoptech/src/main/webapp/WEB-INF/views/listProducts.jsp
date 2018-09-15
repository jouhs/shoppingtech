<div class="container">
	<div class="row">
		<!-- Would be to display sidebar -->
		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>
		</div>
		<!-- to display the actual products -->
		<div class="col-md-9">
			<!-- Added breadcrumb componet -->
			<div class="row">
				<div class="col-lg-12">
					<c:if test="${userClickAllProducts == true }">
						<ol class="breadcrumb">
							<li><a href="${contextRoot }/">Aceuil</a></li>
							<li class="active">Tous les produits</li>
						</ol>
					</c:if>
					<c:if test="${userClickCategoryProducts == true }">
						<ol class="breadcrumb">
							<li><a href="${contextRoot }/">Aceuil</a></li>
							<li class="active">Categorie</li>
							<li class="active">${category.name}</li>
						</ol>
					</c:if>
				</div>
			</div>
		</div>
	</div>
</div>