(ns quicksort.core-test
  (:require [clojure.test :refer :all]
            [quicksort.core :refer :all]))

(deftest sort-list
    (is (= (list 1 2 3 4 5) (qSort (list 3 4 2 5 1)))))

(deftest empty-list-returns-nil
    (is (= nil (qSort (list)))))
