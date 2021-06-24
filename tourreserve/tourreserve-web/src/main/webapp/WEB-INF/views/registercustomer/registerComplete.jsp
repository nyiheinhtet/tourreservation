<hr>
<div align="" style="background: yellow; height: 50px;">
	<t:messagesPanel />
</div>

<div align="" style="background: yellow; height: 70px;">

		<div style="padding-left: 10px; padding-top: 10px;">
			会員情報入力⇒入力内容確認⇒完了<br>
			会員登録が完了しました。お客様の会員IDは${f:h(customer.customerCode)}<br>
			ログインの時必要ですので忘れられないようにご注文ください。
		</div>

</div>
<br>
<div style="padding-left: 10px; padding-top: 10px;">
<form:form action="${pageContext.request.contextPath}/">
<form:button id="menuBtn">メニューへ</form:button>
</form:form>
</div>