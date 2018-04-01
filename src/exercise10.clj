(ns exercise10 (:require [clojure.test :refer :all]))

(defn media [dataset]
  (/ (reduce + dataset) (count dataset)))

(defn exp [x n]
  (reduce * (repeat n x)))

(defn square-sum-function [dataset]
  (fn[x] (exp (- x (media dataset)) 2)))

(defn square-summary [dataset]
  (reduce + (map (square-sum-function dataset) dataset)))

(defn fvariance [dataset]
  (/ (square-summary dataset) (count dataset)))

