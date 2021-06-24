<hr>
<div align="" style="background: #88cdf7; height: 70px;">
    <p style="padding-top: 10px;padding-left: 10px;font-size: 15px;">顧客更新画面です。</p>
</div>

<c:if test="${customerForm!=null}">
<div style="border-style:">
    <form:form modelAttribute="customerForm"
        action="${pageContext.request.contextPath}/customer/update/${customerCode}"
        method="POST">
        <table>
            <tr>
                <td><form:label path="customerKana">フリガナ</form:label></td>
                <td><%-- ${f:h(customerForm.customerKana)} --%>
                 <form:input path="customerKana" value="${customerForm.customerKana}"/>
                 <%-- <form:hidden
                        path="customerKana" /> --%>
                </td>
            </tr>
            <tr>
                <td><form:label path="customerName">氏名</form:label></td>
                <td><%-- ${f:h(customerForm.customerName)} --%>
                 <form:input path="customerName" value="${customerForm.customerName}"/>
                <%--  <form:hidden
                        path="customerName" /> --%>
                </td>
            </tr>
            <tr>
                <td><form:label path="customerBirthYear"> 出発日 </form:label></td>
                <td><%-- ${f:h(customerForm.customerBirthYear)} --%><%-- <form:hidden
                        path="customerBirthYear" />年--%>
                    <%-- ${f:h(customerForm.customerBirthMonth)} --%><%--  <form:hidden
                        path="customerBirthMonth" />月--%>
                    <%-- ${f:h(customerForm.customerBirthDay)} --%> <%-- <form:hidden
                        path="customerBirthDay" />日--%>

                         <form:select path="customerBirthYear">
                        <form:option value="${customerForm.customerBirthYear}">${customerForm.customerBirthYear}</form:option>
                        <form:options items="${CL_BIRTH_YEAR}" />
                    </form:select>年 <form:select path="customerBirthMonth">
                        <form:option value="${customerForm.customerBirthMonth}">${customerForm.customerBirthYear}</form:option>
                        <form:options items="${CL_MONTH}" />
                    </form:select>月 <form:select path="customerBirthDay">
                        <form:option value="${customerForm.customerBirthDay}">${customerForm.customerBirthYear}</form:option>
                        <form:options items="${CL_DAY}" />
                    </form:select>日 <form:errors path="customerBirthDay" />
                </td>
            </tr>
            <tr>
                <td><form:label path="customerJob">職業</form:label></td>
                <td><%-- ${f:h(customerForm.customerJob)} --%>
                <form:input path="customerJob" value="${customerForm.customerJob}"/>
                <%-- <form:hidden
                        path="customerJob" /> --%>
                </td>
            </tr>
            <tr>
                <td><form:label path="customerMail">Eメール</form:label></td>
                <td><%-- ${f:h(customerForm.customerMail)} --%>
                <form:input path="customerMail" value="${customerForm.customerMail}"/>
                <%-- <form:hidden
                        path="customerMail" />--%>
                </td>
            </tr>
            <tr>
                <td><form:label path="customerTel">電話番号</form:label></td>
                <td><%-- ${f:h(customerForm.customerTel)} --%>
                <form:input path="customerTel" value="${customerForm.customerTel}"/>
                <%-- <form:hidden
                        path="customerTel" />--%>
                </td>
            </tr>
            <tr>
                <td><form:label path="customerPost">郵便番号</form:label></td>
                <td><%-- ${f:h(customerForm.customerPost)} --%>
                <form:input path="customerPost" value="${customerForm.customerPost}"/>
               <%--  <form:hidden
                        path="customerPost" />--%>
                </td>
            </tr>
            <tr>
                <td><form:label path="customerAdd">住所</form:label></td>
                <td><%-- ${f:h(customerForm.customerAdd)} --%>
                <form:input path="customerAdd" value="${customerForm.customerAdd}"/>
                <%-- <form:hidden
                        path="customerAdd" /> --%>
                </td>
            </tr>
           <%--  <tr>
                <td><form:label path="customerPass">パスワード</form:label></td>
                <td>${f:h(customerForm.customerPass)}
                <form:hidden
                        path="customerPass" /> <form:hidden path="customerConfirmPass" />
                </td>
            </tr> --%>
        </table>
        <form:button id="redoBtn" name="redo">戻る</form:button>
        <form:button id="updateBtn" name="update">更新</form:button>
    </form:form>
</div>
</c:if>
<c:if test="${customerForm==null}">
<div align="" style="background: yellow; height: 50px;">
    <t:messagesPanel />
</div>
</c:if>