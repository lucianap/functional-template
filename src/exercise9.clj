(ns exercise9)

(defmulti things (fn [thing] [(type thing)]))

(defmethod things [clojure.lang.PersistentVector][thing]
  (str "Soy un Vector"))

(defmethod things [clojure.lang.IPersistentMap][thing]
  (str "Soy un Map"))

(defmethod things [java.lang.String][thing]
  (str "Soy un String"))

(defmethod things :default[thing]
  (str "Soy un default"))