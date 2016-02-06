(ns gray-avici.prod
  (:require [gray-avici.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
