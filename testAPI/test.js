const { spec } = require('pactum');
var expectedSchema = require('./json-schema.json')

describe('API Testing',() => {
  context('Verify User Data', () => {
    it('should get a response with status code 200 and return 20 data', async () => {
      await spec()
        .get('https://api.punkapi.com/v2/beers')
        .withQueryParams('page',2)
        .withQueryParams('per_page',20)
        .expectStatus(200)
        .expectJsonLength(20)
    });

    it('should get a response with status code 200 and return 5 data', async () => {
      await spec()
        .get('https://api.punkapi.com/v2/beers')
        .withQueryParams('page',2)
        .withQueryParams('per_page',5)
        .expectStatus(200)
        .expectJsonLength(5)
    });

    it('should get a response with status code 200 and return 1 data', async () => {
      await spec()
        .get('https://api.punkapi.com/v2/beers')
        .withQueryParams('page',2)
        .withQueryParams('per_page',1)
        .expectStatus(200)
        .expectJsonLength(1)
    });
  });

  context('Verify Schema Json',() => {
    it('should get a response with status code 200 and Match With Schema Json', async () => {
      await spec()
        .get('https://api.punkapi.com/v2/beers')
        .expectStatus(200)
        .expectJsonLength(25)
        .expectJsonSchema(expectedSchema)
    });
  });

});
