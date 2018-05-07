/subsystem=undertow/application-security-domain=other:add(http-authentication-factory=application-http-authentication)
/subsystem=ejb3/application-security-domain=other:add(security-domain=ApplicationDomain)

/subsystem=undertow/server=default-server/host=default-host/setting=http-invoker:undefine-attribute(name=security-realm)
/subsystem=undertow/server=default-server/host=default-host/setting=http-invoker:write-attribute(name=http-authentication-factory, value=application-http-authentication)
