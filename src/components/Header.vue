<template>
  <nav style="height: 50px; line-height: 50px; border-bottom: 1px solid #ccc; display: flex">
    <div style="width: 200px; padding-left: 30px; font-weight: bold; color: dodgerblue"> 后台管理</div>
    <div style="flex: 1"></div>
    <div style="width: 100px">
      <el-dropdown>
      <span class="el-dropdown-link">
        Author
        <el-icon class="el-icon-arrow-down el-icon--right">
<!--          <arrow-down/>-->
        </el-icon>
      </span>
        <template #dropdown>
          <el-dropdown-menu>
            <el-dropdown-item>下拉菜单</el-dropdown-item>
            <el-dropdown-item>Action 2</el-dropdown-item>
            <el-dropdown-item>Action 3</el-dropdown-item>
            <el-dropdown-item disabled>Action 4</el-dropdown-item>
            <el-dropdown-item divided>Action 5</el-dropdown-item>
          </el-dropdown-menu>
        </template>
      </el-dropdown>
    </div>

  </nav>
</template>

<script>
export default {
  name: "Header"
}
</script>

<style scoped>

</style>