

from flask import Flask, jsonify, request
from flask_cors import CORS, cross_origin
import pickle
import pandas as pd
from sklearn.preprocessing import StandardScaler


def func(filename):
    with open(filename, 'rb') as file:
        model = pickle.load(file)
    return model


app = Flask(__name__)
CORS(app)

@app.route('/api/<string:productName>/<string:marketName>/<int:shelfLife>/<int:quantity>/<float:marketDemand>', methods=['GET'])
def predict(productName,marketName,shelfLife,quantity,marketDemand):
    toBePredictedData = {'Shelf Life' : [shelfLife], 'Quantity' : [quantity], 'Market Demand' : [marketDemand]}
    toBePredictedData = pd.DataFrame(toBePredictedData)
    loaded_model = func(productName+marketName+".sav")
    predictedPrice = loaded_model.predict(toBePredictedData)
    return str( predictedPrice[0])


if __name__ == "__main__":
    app.run(debug=False, host='192.168.43.30', port=33)