<%@tag description="Welcome Tag" %>
<%@attribute name="user" required="true"  %>
<%@attribute name="color" required="false" %>


<div style="color: ${empty color ? 'black' : color}" >

<h3>Welcome to the site, ${user}!</h3>
</div> 