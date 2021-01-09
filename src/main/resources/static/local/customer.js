layui.use(['form','table'],function () {
    var $ = layui.jquery,
        layer = layui.layer,
        form = layui.form,
        table = layui.table;
    var queryCustomer = function(data){
        table.render({
            elem:"#custTable",
            url:"/customer/query",
            method:"post",
            contentType: "application/json;charset=UTF-8",
            where:data,
            cols:[[
                {field: 'custId', title: '客户编码', hide: true},
                {field: 'custName', title: '客户名称', width: 100},
                {field: 'businessLicence', title: '营业执照编码', width: 100},
                {field: 'mcc', title: '所属行业', width: 100},
                {field: 'companyBusiness', title: '公司业务', width: 100},
                {field: 'legalId', title: '法人身份证', width: 100},
                {field: 'legalName', title: '法人姓名', width: 100},
                {field: 'accountNo', title: '打款账户', width: 100},
                {field: 'accountName', title: '账户名称', width: 100},
                {field: 'accountBank', title: '开户行', width: 100},
                {field: 'phone', title: '联系手机号', width: 100},
                {field: 'address', title: '联系地址', width: 100},
                {field: 'status', title: '状态', width: 100},
                {field: 'agreement', title: '合同存放路径', width: 100},
                {field: 'serviceFee', title: '服务费率', width: 100},
                {field: 'createTime', title: '创建时间', width: 100, sort: true},
                {field: 'updateTime', title: '更新时间', width: 100, sort: true},
                {field: 'optUser', title: '最后更新操作人', width: 100},
                {title: '操作', minWidth: 150, toolbar: '#customerTableBar', align: "center"}
            ]]
        });
    }

    queryCustomer();

    form.on('submit(custQueryFilter)',function (data) {
        data = data.field;
        queryCustomer(data);
    })

    $("#resetCustQueryFilter").on('click',function () {
        window.console.info("重置表单");
        $("#resetCustQueryFilter").reset();
    })
})