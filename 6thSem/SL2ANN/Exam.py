import numpy as np

def mcCulloch_pitts_AND(x1, x2):
    weights = np.array([1, 1])  
    threshold = 2 
    
    weighted_sum = x1 * weights[0] + x2 * weights[1]
    output = 1 if weighted_sum >= threshold else 0
    return output
def mcCulloch_pitts_OR(x1, x2):
    weights = np.array([1, 1])
    threshold = 1  
    
    weighted_sum = x1 * weights[0] + x2 * weights[1]
    output = 1 if weighted_sum >= threshold else 0
    return output
def mcCulloch_pitts_ANDNOT(x1, x2):
    weights = np.array([1, -1])  
    threshold = 1  
    
    weighted_sum = x1 * weights[0] + x2 * weights[1]
    output = 1 if weighted_sum >= threshold else 0
    return output

print("x1 x2 | AND(x1, x2) | OR(x1, x2) | ANDNOT(x1, x2)")
print("-------------------------------------------------")
for x1 in [0, 1]:
    for x2 in [0, 1]:
        print(f" {x1}  {x2}  |       {mcCulloch_pitts_AND(x1, x2)}      |      {mcCulloch_pitts_OR(x1, x2)}     |       {mcCulloch_pitts_ANDNOT(x1, x2)}")
