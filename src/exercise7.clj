(ns exercise7)

(defn fmap1
  "Map a +1 function"
  [function collection]
  (map function collection))


(defmulti fmap (fn [function collection] [(type function)(type collection)]))

(defmethod fmap [clojure.core$inc clojure.lang.PersistentVector] [function collection]
  (map function collection))

(defmethod fmap [clojure.core$inc clojure.lang.IPersistentMap] [function collection]
  (into {} (for [[key val] collection] [key (function val)])))

(defmethod fmap [clojure.core$inc clojure.lang.PersistentList] [function collection]
  (map function collection))


