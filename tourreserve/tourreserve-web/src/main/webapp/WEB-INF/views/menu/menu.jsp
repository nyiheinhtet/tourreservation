<hr>
<sec:authorize access="hasRole('ROLE_USER')">
<div align="" style="background: #bed7fa;color:black; height: 50px;padding-left: 10px; padding-top: 10px;">
メニュー画面です。
<!-- logout button -->
</div>
</sec:authorize>
<sec:authorize access="!hasRole('ROLE_USER')">
<div align="" style="background: #bed7fa;color:black; height: 50px;padding-left: 10px; padding-top: 10px;">
ログインしていません。メニュー画面です。
</div>
</sec:authorize>
<br>
<div align="" style="background: #faf4af;border:solid;color:black;border-color:#f5e638; height: 70px;">
	<c:url value="/tours" var="searchTouraction" />
	<form:form action="${searchTouraction}" method="GET">
		<div style="padding-left: 10px; padding-top: 10px;">
			<button id="searchBtn">ツアー検索する</button>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			条件を指定してツアーを検索できるます。<br>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			検索したツアーの予約もできます。予約にログインは必要です。
		</div>
	</form:form>
</div>

<br>
<sec:authorize access="!hasRole('ROLE_USER')">
<div align="" style="border:solid;border-color:#f5e638;color:black;background: #faf4af; height: 70px;">
	<c:url value="/login" var="loginaction" />
	<form:form action="${loginaction}" method="GET">
		<div style="padding-left: 10px; padding-top: 10px;">
			<button id="loginBtn">ログインする</button>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			ログインするとツアーの予約、照会、変更ができるようになります。<br>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			ログインするために事前に会員登録が必要です。
		</div>
	</form:form>
</div>

<br>
<div align="" style="border:solid;border-color:#f5e638;color:black;background: #faf4af; height: 70px;">
	<c:url value="/customers/register" var="action" />
	<form:form action="${action}" method="GET" >
		<div style="padding-left: 10px; padding-top: 10px;">
			<button name="form">顧客登録する</button>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			お客様の情報を入力し、会員登録します。<br>
		</div>
	</form:form>
</div>
</sec:authorize>
<br>
<%-- <sec:authorize access="hasRole('ROLE_USER')">
	<div align="" style="background: #faf4af; height: 70px;">
		<c:url value="/customers/register" var="action" />
		<form:form action="${action}" method="GET">
			<div style="padding-left: 10px; padding-top: 10px;">
				<button name="form">予約を照会する</button>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				ツアー予約を登録します。<br>
			</div>
		</form:form>
	</div>
</sec:authorize> --%>