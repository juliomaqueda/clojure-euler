(ns clojure-euler.exercise-006-test
  (:require [clojure.test :refer :all]
            [clojure-euler.exercise-006 :refer :all]))


(deftest euler-006-test
  (let [valid-input 100
        expected-result 25164150]
    (testing "Testing euler-006"
      (is (= expected-result (euler-006 valid-input))))))


;; Run all tests
(run-tests)