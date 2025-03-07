import numpy as np
import matplotlib.pyplot as plt

# Activation functions
def sigmoid(x): return 1 / (1 + np.exp(-x))
def tanh(x): return (np.exp(x) - np.exp(-x)) / (np.exp(x) + np.exp(-x))  # tanh formula
def relu(x): return np.maximum(0, x)
def softmax(x): return np.exp(x) / np.sum(np.exp(x))

# Input range
x = np.linspace(-10, 10, 400)
x_softmax = np.linspace(-10, 10, 5)

# Plotting the functions
plt.figure(figsize=(12, 8))

plt.subplot(2, 2, 1); plt.plot(x, sigmoid(x)); plt.title('Sigmoid')
plt.subplot(2, 2, 2); plt.plot(x, tanh(x)); plt.title('Tanh')
plt.subplot(2, 2, 3); plt.plot(x, relu(x)); plt.title('ReLU')
plt.subplot(2, 2, 4); plt.bar(x_softmax, softmax(x_softmax)); plt.title('Softmax')

plt.tight_layout()
plt.show()