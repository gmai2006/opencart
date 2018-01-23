ModelAccountReward.getTotalRewards.getTotalRewards=SELECT COUNT(*) AS total FROM "oc_customer_reward" WHERE customer_id = 'param0'
#END
ModelAccountReward.getTotalPoints.getTotalPoints=SELECT SUM(points) AS total FROM "oc_customer_reward" WHERE customer_id = 'param0' GROUP BY customer_id
#END
