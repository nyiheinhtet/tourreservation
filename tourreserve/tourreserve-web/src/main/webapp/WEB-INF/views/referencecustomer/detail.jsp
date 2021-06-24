<hr>

<div align="" style="background: #bed7fa;color:black; height: 80px;">
	<p style="padding-top: 10px; padding-left: 10px; font-size: 15px;">顧客詳細画面です。</p>
</div>

<!-- <div align="" style="background: yellow; height: 50px;">

</div> -->

<div style="border-style:">
    <br>
	<c:if test="${!empty customer}">
		<table style="color:black;border: solid;">
			<tr>
				<td><label>フリガナ</label></td>
				<td>${f:h(customer.customerKana)}</td>
			</tr>
			<tr style="background: #e8ebed;">
				<td><label>氏名</label></td>
				<td>${f:h(customer.customerName)}</td>
			</tr>
			<tr>
				<td><label>誕生日</label></td>
				<td>
					<%-- ${f:h(customerForm.customerBirthYear)}<form:hidden
								path="customerBirthYear" />年
							${f:h(customerForm.customerBirthMonth)} <form:hidden
								path="customerBirthMonth" />月
							${f:h(customerForm.customerBirthDay)} <form:hidden
								path="customerBirthDay" />日 --%> <fmt:formatDate type="date"
						value="${customer.customerBirth}" pattern="yyyy" />年 <fmt:formatDate
						type="date" value="${customer.customerBirth}" pattern="MM" />月 <fmt:formatDate
						type="date" value="${customer.customerBirth}" pattern="dd" />日

				</td>
			</tr>
			<tr style="background: #e8ebed;">
				<td><label>職業</label></td>
				<td>${f:h(customer.customerJob)}</td>
			</tr>
			<tr>
				<td><label>Eメール</label></td>
				<td>${f:h(customer.customerMail)}</td>
			</tr>
			<tr style="background: #e8ebed;">
				<td><label>電話番号</label></td>
				<td>${f:h(customer.customerTel)}</td>
			</tr>
			<tr>
				<td><label>郵便番号</label></td>
				<td>${f:h(customer.customerPost)}</td>
			</tr>
			<tr style="background: #e8ebed;">
				<td><label>住所</label></td>
				<td>${f:h(customer.customerAdd)}</td>
			</tr>
		</table>
	</c:if>
    <c:if test="${customer == null}">
    <br>
    <h1>
        <t:messagesPanel />
    </h1><br><br><br><br><br><br><br><br><br><br>
</c:if>
	<%-- <form:form modelAttribute="customerForm"
		action="${pageContext.request.contextPath}/customers/register"
		method="POST"> --%>
	<br>
	<%-- </form:form> --%>
</div>
<hr>

<div>
	<input type="button" value="戻る" onclick="javascript:history.back()"></input>
</div>