(defn make-student [name]
	[:type :student
	   :name name])

(defn make-faculty [name]
	[:type :faculty
	  :name name])

(default parking-fee (fn [person & args]
			(:type person)))



(defmethod parking-fee :student
	[person months]
	(*40.0 months))


(defmethod parking-fee :faculty
	[person months]
	(*months (/ 2000.0 12)))

;; (parking-fee (make-faculty "Jack")12)