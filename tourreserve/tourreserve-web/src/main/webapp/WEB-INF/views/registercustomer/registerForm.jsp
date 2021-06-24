<hr>
<div align="" style="background: yellow; height: 50px;">
	<t:messagesPanel />
</div>

<div style="border-style: solid">

<form:form action="${pageContext.request.contextPath}/customers/register" modelAttribute="customerForm" method="POST">
フリガナ（必要）<br>
<form:input path = "customerKana" /><form:errors path="customerKana" /><br>
氏名（必要）<br>
<form:input path = "customerName" /><form:errors path="customerName" /><br>
誕生日（必要）<br>
<form:select path="customerBirthYear">
        <form:options items="${CL_BIRTH_YEAR}"/>
</form:select>年
<form:errors path="customerBirthYear" />
<form:select path="customerBirthMonth">
        <form:options items="${CL_MONTH}"/>
</form:select>月
<form:errors path="customerBirthMonth" />
<form:select path="customerBirthDay">
        <form:options items="${CL_DAY}"/>
</form:select>日
<form:errors path="customerBirthDay" /><br>
職業（必要）<br>
<form:input path = "customerJob" /><form:errors path="customerJob" /><br>
Eメール（必要）<br>
<form:input path = "customerMail" /><form:errors path="customerMail" /><br>
電話番号（必要）<br>
<form:input path = "customerTel" /><form:errors path="customerTel" /><br>
郵便番号（必要）<br>
<form:input path = "customerPost" /><form:errors path="customerPost" /><br>
住所（必要）<br>
<form:input path = "customerAdd" /><form:errors path="customerAdd" /><br>
パスワード（必要）<br>
<form:input path = "customerPass" /><form:errors path="customerPass" /><br>
確認パスワード（必要）<br>
<form:input path = "customerConfirmPass" /><form:errors path="customerConfirmPass" /><br>
<form:button id="confirmBtn" name="confirm">確認</form:button>
<form:button id="resetBtn" name="reset">リセット</form:button>
</form:form>
</div>