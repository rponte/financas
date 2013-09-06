<%@ page pageEncoding="UTF-8"%>
<jsp:include page="/templates/jstl.jsp" />

		<div class="navbar navbar-inverse navbar-fixed-top">
			<div class="navbar-inner">
				<div class="container-fluid">
					<a class="brand" href="#">Finanças</a>
					<div class="nav-collapse collapse">
						<ul class="nav">
							<li class="active"><a href="${ctx}/contas/pagar">Conta à Pagar</a></li>
							<li class="active"><a href="${ctx}/contas/receber">Conta à Receber</a></li>
							<li><a href="${ctx}/usuario/lista">Usuários</a></li>
						</ul>
						<ul class="nav pull-right">
	                      <li><a href="#"><span class="badge badge-success">${usuarioWeb.usuario.nome }</span></a></li>
	                      <li class="divider-vertical"></li>
	                      <li><a href="${ctx }/logout">Sair</a></li>
	                    </ul>
					</div>
				</div>
			</div>
		</div>