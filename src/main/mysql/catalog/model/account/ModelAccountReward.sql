getTotalRewards=SELECT COUNT(*) AS total FROM  oc_customer_reward  WHERE customer_id = ?1
#END
getTotalPoints=SELECT SUM(points) AS total FROM  oc_customer_reward  WHERE customer_id = ?1 GROUP BY customer_id
#END
