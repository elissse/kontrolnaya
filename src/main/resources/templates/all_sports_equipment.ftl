<html xmlns="">
<head>
    <title> welcome!</title>
    <meta charset="utf-8\">

</head>
<body>
<h1>this is sports equipment we have in store:</h1>

<div>
    <#list sports_equipment_list as sports_equipment>
        <form method="get" action="${sports_equipment.name()}.ftl">
            <div class="form-group form-button">
                <a href="view_sports_equipment" >${sports_equipment.name()}</a>

            </div>
        </form>
    </#list>
</div>
</body>
</html>