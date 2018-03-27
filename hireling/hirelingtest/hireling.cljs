(ns hirelingtest.hireling)

(println "Hello From The Service Worker.")

(defn reload-hook []
  (println "Reloaded figwheel code."))