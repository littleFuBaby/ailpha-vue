<script setup>
import HelloWorld from './components/HelloWorld.vue'
import TheWelcome from './components/TheWelcome.vue'
</script>

<template>
  <header>
    <img alt="Vue logo" class="logo" src="./assets/logo.svg" width="125" height="125" />

    <div class="wrapper">
      <HelloWorld msg="You did it!" />
    </div>
    <div>
      <button @click="getData">获取数据</button>
      <ul>
        <li v-for="item in list" :key="item.id">{{ item.name }}</li>
      </ul>
    </div>
  </header>

  <main>
    <TheWelcome />
  </main>
</template>
<script>
import axios from 'axios'

export default {
  data () {
    return {
      list: []
    }
  },
  methods: {
    async getData () {
      //const response = await axios.get('/api/data')
      //this.list = response.data
      this.list = '1345345';
    }
  }
}
</script>

<style scoped>
header {
  line-height: 1.5;
}

.logo {
  display: block;
  margin: 0 auto 2rem;
}

@media (min-width: 1024px) {
  header {
    display: flex;
    place-items: center;
    padding-right: calc(var(--section-gap) / 2);
  }

  .logo {
    margin: 0 2rem 0 0;
  }

  header .wrapper {
    display: flex;
    place-items: flex-start;
    flex-wrap: wrap;
  }
}
</style>
