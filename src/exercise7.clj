(ns exercise7)

(defn fmap1
  "Map a +1 function"
  [function collection]
  (map function collection))


(defmulti fmap (fn [function collection] [(type collection)]))

(defmethod fmap [clojure.lang.PersistentVector] [function collection]
  (map function collection))

(defmethod fmap [clojure.lang.IPersistentMap] [function collection]
  (into {} (for [[key val] collection] [key (function val)])))

(defmethod fmap [clojure.lang.PersistentList] [function collection]
  (map function collection))


