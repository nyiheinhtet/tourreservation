<hr>
<div align="" style="background: yellow; height: 50px;">
	<t:messagesPanel />
</div>

<div style="border-style: solid">
	<form:form modelAttribute="customerForm"
		action="${pageContext.request.contextPath}/customers/register"
		method="POST">
		<table>
			<tr>
				<td><form:label path="customerKana">フリガナ</form:label></td>
				<td>${f:h(customerForm.customerKana)}<form:hidden
						path="customerKana" />
				</td>
			</tr>
			<tr>
				<td><form:label path="customerName">氏名</form:label></td>
				<td>${f:h(customerForm.customerName)}<form:hidden
						path="customerName" />
				</td>
			</tr>
			<tr>
				<td><form:label path="customerBirthYear">誕生日</form:label></td>
				<td>${f:h(customerForm.customerBirthYear)}<form:hidden
						path="customerBirthYear" />年
					${f:h(customerForm.customerBirthMonth)} <form:hidden
						path="customerBirthMonth" />月
					${f:h(customerForm.customerBirthDay)} <form:hidden
						path="customerBirthDay" />日
				</td>
			</tr>
			<tr>
				<td><form:label path="customerJob">職業</form:label></td>
				<td>${f:h(customerForm.customerJob)}
				<form:hidden
						path="customerJob" />
				</td>
			</tr>
			<tr>
				<td><form:label path="customerMail">Eメール</form:label></td>
				<td>${f:h(customerForm.customerMail)}<form:hidden
						path="customerMail" />
				</td>
			</tr>
			<tr>
				<td><form:label path="customerTel">電話番号</form:label></td>
				<td>${f:h(customerForm.customerTel)}<form:hidden
						path="customerTel" />
				</td>
			</tr>
			<tr>
				<td><form:label path="customerPost">郵便番号</form:label></td>
				<td>${f:h(customerForm.customerPost)}<form:hidden
						path="customerPost" />
				</td>
			</tr>
			<tr>
				<td><form:label path="customerAdd">住所</form:label></td>
				<td>${f:h(customerForm.customerAdd)}<form:hidden
						path="customerAdd" />
				</td>
			</tr>
			<tr>
				<td><form:label path="customerPass">パスワード</form:label></td>
				<td>${f:h(customerForm.customerPass)}<form:hidden
						path="customerPass" /> <form:hidden path="customerConfirmPass" />
				</td>
			</tr>
		</table>
		<form:button id="redoBtn" name="redo">戻る</form:button>
		<form:button id="registerBtn">登録</form:button>
	</form:form>
</div>