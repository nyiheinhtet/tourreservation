<hr>
<sec:authorize access="hasRole('ROLE_USER')">
	<div align="" style="background:; height: 70px;">
		<c:url value="/logout" var="logout" />
		<form:form action="${logout}" method="POST">
			<div style="padding-left: 10px; padding-top: 10px;">
				<button id="searchBtn" name="initForm">ログアウト</button>
			</div>
		</form:form>
	</div>
</sec:authorize>
<sec:authorize access="!hasRole('ROLE_USER')">
	<div align="" style="background: #bed7fa; color: black; height: 50px;">
		<p style="padding-top: 10px; padding-left: 10px;">ログインしていません。</p>

	</div>
</sec:authorize>
<br>
<div align=""
	style="background:; color: black; height: 50px; font-size: 20px;">
	<p>ツアー検索案件</p>
</div>

<div style="border-style: solid; color: black;">
	<form:form action="${pageContext.request.contextPath}/tours"
		modelAttribute="searchTourForm" method="GET">
		<table>
			<tr>
				<td>出発日 <form:select path="departureYear">
						<form:options items="${CL_DEPYEAR}" />
					</form:select>年 <form:select path="departureMonth">
						<form:options items="${CL_MONTH}" />
					</form:select>月 <form:select path="departureDate">
						<form:options items="${CL_DAY}" />
					</form:select>日 <form:errors path="departureDate" /></td>
				<td>日数 <form:select path="tourDays">
						<form:options items="${CL_TOUR_DAYS}" />
					</form:select>日 <form:errors path="tourDays" /></td>
			</tr>
			<tr>
				<td>(本日から一週間後以降の日付を入力してください。)</td>
				<td></td>
			</tr>
			<tr>
				<td>出発地<form:select path="depCode">
						<form:options items="${CL_DEP_PREF}" />
					</form:select> <form:errors path="depCode" /></td>
				<td>目的地<form:select path="arrCode">
						<form:options items="${CL_ARR_PREF}" />
					</form:select> <form:errors path="arrCode" /></td>
			</tr>
			<tr>
				<td>人数 大人<form:select path="adultCount">
						<form:options items="${CL_ADULT_COUNT}" />
					</form:select> <form:errors path="adultCount" /> 子供<form:select
						path="childCount">
						<form:options items="${CL_CHILD_COUNT}" />
					</form:select> <form:errors path="childCount" /></td>
				<td>基本料金<form:select path="basePrice">
						<form:options items="${CL_BASE_PRICE}" />
					</form:select> <form:errors path="basePrice" /></td>
			</tr>
			<tr>
				<td>(大人：12歳以上 子ども：12歳未満)</td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
			</tr>
		</table>
		<div style="padding-bottom: 10px;padding-left: 10px;"><form:button id="searchBtn">検索</form:button></div>
	</form:form>
</div>
<c:if test="${page != null && page.totalElements != 0}">
<br>
	<div align=""
		style="background: #faf4af; border: solid; color: black; border-color: #f5e638; height: 35px; padding-left: 10px; padding-top: 10px;">
		${pageSize}件が見つかりました。</div>
	<div align="center">
		<t:pagination page="${page}" outerElementClass="pagination"
			criteriaQuery="${f:query(searchTourForm)}" />
	</div>
	<div style="border-style: solid; color: black;">
		<table>
			<tr>
				<th>連番</th>
				<th>ツアー名</th>
				<th>出発日</th>
				<th>日数</th>
				<th>出発地</th>
				<th>目的地</th>
				<th>基本料金</th>
			</tr>
			<c:forEach items="${page.content}" var="tourInfo"
				varStatus="rowStatus">
				<tr>
					<td>${(page.number * page.size) + rowStatus.count}</td>
					<td>${tourInfo.tourName}</td>

					<td><fmt:formatDate type="date" value="${tourInfo.depDay}"
							pattern="yyyy" />年 <fmt:formatDate type="date"
							value="${tourInfo.depDay}" pattern="MM" />月 <fmt:formatDate
							type="date" value="${tourInfo.depDay}" pattern="dd" />日</td>
					<td>${tourInfo.tourDays}</td>
					<td>${tourInfo.departure.depName}</td>
					<td>${tourInfo.arrival.arrName}</td>
					<td>${tourInfo.basePrice}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<div align="center">
		<t:pagination page="${page}" outerElementClass="pagination"
			criteriaQuery="${f:query(searchTourForm)}" />
	</div>
</c:if>
<%-- <c:if test="${page != null && page.totalElements == 0}"> --%>
<%-- </c:if> --%>