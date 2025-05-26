// 10페이지
use test;

for(let i = 0; i<20000; i++) {
    db.product.insertOne({num: i, name: '스마트폰'+i});
}

db.product.find({})
db.product.countDocuments()

// 11페이지
db.product.find({}).sort({'num':-1})

db.product.find({}).sort({'num':-1}).limit(10)

page_number = 6
page_size = 10

products = db.product.find({}).sort({'num':-1}).skip((page_number-1)*page_size).limit(page_size)


// 12페이지
db.product.find({
    '$or': [
        {'num': {'$lt': 15}},
        {'num': {'$gt': 19995}}
    ]
})


db.product.find({
    '$or': [
        {'name': '스마트폰10'},
        {'name': '스마트폰100'},
        {'name': '스마트폰1000'}
    ]
})

// 13페이지

db.product.find(
    { 'num': { '$lt': 5 } },
    { 'name': 1, '_id': 0 }
)