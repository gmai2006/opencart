ControllerStartupSession.index.index=SELECT DISTINCT * FROM "oc_api" "a" LEFT JOIN "oc_api_session" "as" ON (a.api_id = as.api_id) LEFT JOIN oc_api_ip "ai" ON (as.api_id = ai.api_id) WHERE a.status = '1' AND as.token = 'param0' AND ai.ip = 'param1'
#END
