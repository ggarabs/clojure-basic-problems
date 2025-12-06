(ns fn.bee-1075)

(defn -main [& _]
  (let [n (Integer/parseInt (read-line))]
    (run! println (filter (fn [x] (= 2 (mod x n))) (range 1 10001)))))

(-main)
