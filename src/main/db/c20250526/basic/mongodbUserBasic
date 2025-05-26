// 2페이지
use tutorial;

db.users.insert({username: "smith"});

db.users.insert({username: "jones"});

db.users.find();

db.users.find({username: "smith"});

// 3페이지
db.users.find({username: "jones"});

db.users.find({
    $or: [
        {username: "jones"},
        {username: "smith"}
    ]
})

// 4페이지
db.users.update({username: "smith"}, {$set: {country: "Canada"}})
db.users.find({username: "smith"});

// 5페이지
db.users.replaceOne({username: "smith"}, {country: "Canada"})
db.users.find({country: "Canada"});

db.users.replaceOne({country: "Canada"}, {username: "smith", country: "Canada"})
db.users.find({country: "Canada"});

// 6페이지
db.users.update({username: "smith"}, {$unset: {country: 1}})
db.users.find({username: "smith"});


// 7페이지
show dbs;

show collections;

db.stats();
db.users.stats();


// 8페이지
db.users.remove({"username": "smith"})
db.users.find({username: "smith"});
db.users.find();

db.users.remove({})
db.users.find();

db.users.drop()