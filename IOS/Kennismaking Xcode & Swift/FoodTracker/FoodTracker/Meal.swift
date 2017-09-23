//
//  Meal.swift
//  FoodTracker
//
//  Created by brecht philips on 24/09/2017.
//  Copyright © 2017 Apple Inc. All rights reserved.
//

import UIKit

class Meal{
    
    //MARK: Properties
    var name: String
    var photo: UIImage?
    var rating : Int
    
    //MARK; Initailization
    
    init?(name: String,photo: UIImage?,rating: Int) {
        // Initialization should fail if there is no name or if the rating is negative.
        // The name must not be empty
        //A guard statement declares a condition that must be true in order for the code after the guard statement to be executed
        guard !name.isEmpty else {
            return nil
        }
        
        // The rating must be between 0 and 5 inclusively
        guard (rating >= 0) && (rating <= 5) else {
            return nil
        }
        
        // Initialize stored properties.
        self.name = name
        self.photo = photo
        self.rating = rating
    }
}
