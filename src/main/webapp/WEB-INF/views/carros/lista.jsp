<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib tagdir="/WEB-INF/tags/" prefix="carro"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<carro:template>
	<jsp:body>
		<table class="table table-hover ">
			<thead>
				<tr>
					<th class="text-center">Modelo</th>
					<th class="text-center">Cor</th>
					<th class="text-center">Marca</th>
					<th class="text-center">Ano</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${carros}" var="carro">
					<td class="text-center">${carro.modelo }
					</td>
					<td class="text-center">${carro.cor }
					</td>
					<td class="text-center">${carro.marca }
					</td>
					<td class="text-center">${carro.ano }
					</td>
			
				</c:forEach>
			</tbody>
		</table>
	</jsp:body>
</carro:template>