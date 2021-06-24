<div>
	<div>
		<c:if test="${param.error}">
			<t:messagesPanel
				messagesAttributeName="SPRING_SECURITY_LAST_EXCEPTION" />
		</c:if>
	</div>

	<div>
		<c:url value="/authenticate" var="action" />
		<form:form action="${action}" method="POST">

			<p>
				<label for="username">会員ID:</label><br> <input type="text"
					name="username" id="username" value="" placeholder="UserID">
			</p>
			<p>
				<label for="password">パスワード:</label><br> <input type="password"
					name="password" id="password" value="" placeholder="handson">
			</p>
			<p>
				<button id="loginBtn">ログイン</button>
				<button id="resetBtn">リセット</button>
			</p>

		</form:form>
	</div>
	<hr>
	<div>
	会員IDを持っていないお客様は以下のボタンで会員登録を行ってください。
	<c:url value="/customers/register" var="action" />
	<form:form action="${action}" method="GET" >
		<button id="customerRegisterBtn" name="form">顧客登録する</button>
	</form:form>
	</div>
</div>